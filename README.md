# study-java
以下のフローに沿ってJavaの学習記録を残していきます。
```mermaid
graph TD
    Start(開始) --> Q[ChatGPTから問題出題]
    Q --正解--> R[コードリファクタリング]
    Q --不正解--> H[ヒントを出す]
    R --> NQ{次の問題}
    NQ --はい--> Q
    NQ --いいえ--> End{終了}
    H --> Q

```

## 何が嬉しいのか
- 問題のレベルを5段階に分けて出題してもらうので、自分の実力がわかりやすい
- 正解したら自身のコードを最適にリファクタして提示してくれるため理解がしやすい

## 環境構築

```
docker build -t study-java .
```

```
docker run -it --rm -v "$(pwd)":/workspace -w /workspace study-java bash -c "javac HelloWorld.java && java HelloWorld"
```

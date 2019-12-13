# Kotlin + GraphQLのサンプルアプリケーション

## Usage
### 必要環境
Java 11

### セットアップ
```
    ./gradlew sync
```

### 起動
```
    ./gradlew bootRun
```

### アクセス

```
http://localhost:8080/graphiql
```

### クエリのサンプル

```
query {
	getAllPlayers {
    name
    id
    team {
      teamName
    }

	}
}
```

## License
WTFPL

function fn() {
    var config = {
      apiNewsURL: 'http://localhost:8080/api/news'
    };

    karate.configure('connectTimeout', 5000)
    karate.configure('readTimeout', 5000)
    return config;
}
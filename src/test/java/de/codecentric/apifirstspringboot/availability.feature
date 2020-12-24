Feature: News API

Scenario: News API available
  Given url 'http://127.0.0.1:8080/api/news'
  When method get
  Then status 200
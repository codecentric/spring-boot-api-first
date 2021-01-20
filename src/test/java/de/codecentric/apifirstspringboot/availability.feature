Feature: News API

Scenario: News API available
  Given url 'http://localhost:8080/api/news'
  When method get
  Then status 200
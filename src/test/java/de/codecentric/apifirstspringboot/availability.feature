Feature: News API

  Background:
    * url 'http://localhost:8080'

Scenario: News API available
  Given path '/api/news'
  When method get
  Then status 200
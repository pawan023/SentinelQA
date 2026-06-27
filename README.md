# SentinelQA

An AI-powered Test Automation Platform built with Java + Playwright.

## Vision

SentinelQA is a production-inspired automation platform that demonstrates how modern AI can enhance test automation workflows rather than replace engineers.

It combines UI automation, API testing, intelligent reporting, AI-assisted debugging, self-healing suggestions, and CI/CD into one cohesive framework.

The emphasis is on clean architecture, maintainability, and developer experience, not unnecessary complexity.

## Tech Stack

*   **Language:** Java 21
*   **Automation:** Playwright Java
*   **API:** REST Assured
*   **Testing:** JUnit 5
*   **Build:** Maven
*   **Reporting:** Allure Report
*   **Logging:** SLF4J & Logback
*   **JSON:** Jackson
*   **Utilities:** Apache Commons
*   **Configuration:** Owner / Properties
*   **Version Control:** Git
*   **CI/CD:** GitHub Actions
*   **Containerization:** Docker
*   **AI:** Gemini API (Google AI Studio)

## High-Level Architecture

```
                   +----------------+
                   | GitHub Actions |
                   +--------+-------+
                            |
                            |
                    Execute Tests
                            |
                            |
             +--------------v-------------+
             |        SentinelQA          |
             +--------------+-------------+
             UI Testing    API Testing
                |              |
          Playwright      REST Assured
                |
          Reporting Layer
                |
          Allure + Logs
                |
           AI Intelligence Layer
        ---------------------------
        Failure Analyzer
        Locator Suggestions
        Test Generator
        Test Summary
        Smart Debugging
```

## Modules

*   **Core Automation:** Base for Playwright automation.
*   **API Automation:** Integrated API testing with REST Assured.
*   **Reporting Module:** Allure reports, screenshots, videos, and logs.
*   **AI Module:** AI-powered features like failure analysis and test generation.
*   **Configuration Module:** Environment-based configurations.
*   **Logging:** Centralized logging.
*   **CI/CD:** GitHub Actions for continuous integration.
*   **Docker:** Containerization for easy setup.

## Features

*   [ ] AI Failure Analyzer
*   [ ] Smart Locator Assistant
*   [ ] AI Test Generator
*   [ ] AI Regression Summary
*   [ ] AI Bug Report Generator

## Setup

...

## Run Tests

...

## Reports

...

## AI Features

...

## Screenshots

...

## Videos

...

## Future Roadmap

...


# SIFT

Stoneworks Interbank Financial Telecommunication

This is a spring boot multi project application with microservices to fulfill what is needed to run a bank communication network in stoneworks.
## Structure

| Codebase           |      Description      |
|:-------------------|:---------------------:|
| [Gateway](gateway) |       SIFT API        |
| [Discord](discord) |     Bot Processor     |
| [Forex](forex)     | Exchange Rate Graphs  |
| [Ledger](ledger)   | Open Transactions API |
| [Library](library) |    Shared Classes     |

## Tech Stack

**Server:** Spring Boot

**Database:** PostgreSQL

**Message Broker:** RabbitMQ

## Run Locally

Clone the project

```bash
  git clone https://github.com/BankOfSimulami/SIFT.git
```

Go to the project directory

```bash
  cd SIFT
```

Start SIFT

```bash
  docker compose up -d
```


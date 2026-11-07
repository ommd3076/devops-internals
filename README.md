# DevOps Internals & Lab Practicals

A comprehensive collection of DevOps laboratory practicals, containerization experiments, continuous integration pipelines, build automation, and infrastructure configurations.

## Table of Contents

- [Overview](#overview)
- [Repository Structure](#repository-structure)
- [Modules & Components](#modules--components)
  - [1. Docker Containerization](#1-docker-containerization)
  - [2. Kubernetes Deployments](#2-kubernetes-deployments)
  - [3. Maven Build Automation & Testing](#3-maven-build-automation--testing)
  - [4. Lab Procedure Visual Guides](#4-lab-procedure-visual-guides)
  - [5. Theoretical Revision Guide](#5-theoretical-revision-guide)
- [Technologies & Tools](#technologies--tools)
- [How to Run](#how-to-run)
- [Author](#author)

## Overview

This repository hosts practical implementations and theoretical documentation covering modern DevOps methodologies:
- Version control workflows with Git
- Build lifecycle and dependency management using Apache Maven
- Container packaging and deployment with Docker
- Container orchestration and service networking via Kubernetes manifests
- Continuous Integration pipelines with Jenkins and automated Slack notification integrations

## Repository Structure

```text
.
|-- Docker/                     # Docker container configuration and web landing page
|-- dock/                       # Apache httpd containerization experiment
|-- k8's tutorial/              # Kubernetes Service manifest and container specifications
|-- mv1/                        # Apache Maven project (App, JSON reader, JUnit test suites)
|   |-- JSON/student.json       # JSON data fixture
|   |-- pom.xml                 # Maven POM build configuration
|   \-- src/                    # Java source code and JUnit tests
|-- procedures/                 # 9-part visual lab procedure reference guides
|   |-- 01-Git-Page-01.jpeg     # Git basics lab reference
|   |-- 02-Git-Page-02.jpeg     # Git branching and merging
|   |-- 03-Maven-Page-03.jpeg   # Maven project configuration
|   |-- 04-Maven-Page-04.jpeg   # Maven build lifecycle
|   |-- 05-Docker-Page-05.jpeg  # Docker image creation and execution
|   |-- 06-Jenkins-CI-Page-06.jpeg # Jenkins CI pipeline configuration
|   |-- 07-Jenkins-CI-Page-07.jpeg # Jenkins automated build steps
|   |-- 08-Jenkins-Slack-Page-08.jpeg # Jenkins Slack notification integration
|   \-- 09-Jenkins-Slack-Page-09.jpeg # Webhook validation and alerts
|-- devops_revision_guide.html  # Comprehensive interactive DevOps study & revision guide
|-- test.java                   # Java sanity check utility
\-- README.md                   # Repository documentation
```

## Modules & Components

### 1. Docker Containerization
- **`Docker/`**: Demonstrates custom Docker image builds serving static web applications.
- **`dock/`**: Containerized Apache HTTP server (`httpd:alpine`) custom web service deployment.

### 2. Kubernetes Deployments
- **`k8's tutorial/`**: Contains Kubernetes `Service.yml` manifests demonstrating declarative service routing, pod selectors, target ports, and nodePort bindings for microservice workloads.

### 3. Maven Build Automation & Testing
- **`mv1/`**: Structured Java Maven project demonstrating:
  - Standard Maven directory layout (`src/main/java`, `src/test/java`)
  - Dependency management for JSON parsing (`json-simple`) and JUnit testing
  - Data fixture ingestion from `JSON/student.json`
  - Automated unit test execution via `AppTest.java` and `readjson.java`

### 4. Lab Procedure Visual Guides
- **`procedures/`**: Contains step-by-step visual documentation covering nine key DevOps laboratory exercises:
  1. Git repository setup, commits, and remote workflows
  2. Git branch creation, checkout, conflict resolution, and merge operations
  3. Maven project initialization and POM structure
  4. Maven compile, package, and test phases
  5. Docker build, tag, run, and port forwarding commands
  6. Jenkins CI installation and freestyle project setup
  7. Jenkins automated pipeline trigger and execution
  8. Jenkins Slack plugin installation and webhook configuration
  9. Slack build notifications and channel alert triggers

### 5. Theoretical Revision Guide
- **`devops_revision_guide.html`**: Complete standalone web documentation summarizing key architectural concepts, DevOps culture, CI/CD stages, container orchestration, and exam preparation notes.

## Technologies & Tools

- **Version Control**: Git & GitHub
- **Containerization**: Docker
- **Orchestration**: Kubernetes
- **Build Automation**: Apache Maven, Java SE (JDK 21)
- **CI/CD**: Jenkins CI, Slack Webhooks
- **IDE**: Eclipse IDE workspace integration

## How to Run

### Docker Services
```bash
# Build Docker image
cd Docker
docker build -t devops-web:1.0 .

# Run container
docker run -d -p 8080:80 devops-web:1.0
```

### Kubernetes Service
```bash
# Apply Service manifest to cluster
cd "k8's tutorial"
kubectl apply -f Service.yml
```

### Maven Project
```bash
# Build and run Maven tests
cd mv1
mvn clean test
```

## Author

- **OM**

---
*Created as part of academic coursework and hands-on laboratory practicals in DevOps Engineering.*

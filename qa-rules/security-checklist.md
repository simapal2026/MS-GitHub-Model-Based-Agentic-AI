# 🔐 Security Checklist for Code Review & Agentic QA

This checklist is used by developers, reviewers, and AI agents to validate security posture before merge.

---

## 🧩 1. Authentication & Authorization

- [ ] All APIs are protected using authentication (OAuth2 / JWT / API Key)
- [ ] No endpoint is publicly exposed without explicit justification
- [ ] Role-based access control (RBAC) is enforced
- [ ] Sensitive APIs validate scopes/roles properly
- [ ] No hardcoded credentials or tokens in code

---

## 🔑 2. Secrets Management

- [ ] No secrets in source code (passwords, API keys, tokens)
- [ ] Secrets are stored in environment variables or secret managers
- [ ] Encryption keys are not hardcoded
- [ ] Config files do not expose credentials
- [ ] Use secure vaults where applicable

---

## 🌐 3. Input Validation & Injection Protection

- [ ] All inputs are validated (DTO validation, annotations)
- [ ] SQL queries use prepared statements / ORM (no string concatenation)
- [ ] Protection against SQL Injection
- [ ] Protection against Command Injection
- [ ] JSON/XML payloads validated against schema
- [ ] File uploads validated (size, type, content)

---

## 🛡️ 4. API Security (Spring Boot / Apigee)

- [ ] Rate limiting applied (e.g., filters / gateway policies)
- [ ] CORS is properly configured (no wildcard in production)
- [ ] API gateway enforces authentication
- [ ] Backend services are not directly exposed
- [ ] API input/output validation enforced

---

## 🔒 5. Data Protection

- [ ] Sensitive data encrypted at rest
- [ ] TLS 1.2+ enforced for data in transit
- [ ] No sensitive data in logs (PII, passwords, tokens)
- [ ] Masking/tokenization applied where needed
- [ ] Compliance requirements considered (e.g., GDPR)

---

## 🧾 6. Logging & Monitoring

- [ ] Security events are logged (login, failure, access)
- [ ] Logs do not contain secrets or sensitive payloads
- [ ] Centralized logging is enabled
- [ ] Alerts configured for suspicious activities
- [ ] Audit trail is maintained

---

## ⚙️ 7. Dependency & Library Security

- [ ] No vulnerable dependencies
- [ ] Dependencies are up-to-date
- [ ] No unused libraries included
- [ ] Known vulnerabilities reviewed before merge

---

## 🧪 8. Error Handling

- [ ] No stack traces exposed in API responses
- [ ] Generic error messages returned to clients
- [ ] Detailed errors logged internally only
- [ ] Custom exception handling implemented

---

## 🧠 9. Secure Coding Practices

- [ ] No use of System.out.println for logging
- [ ] Proper logging framework used (e.g., SLF4J / Logback)
- [ ] No hardcoded URLs/endpoints
- [ ] Null checks and validation handled
- [ ] Defensive coding practices followed

---

## ☁️ 10. Cloud & Infrastructure Security

- [ ] IAM roles follow least privilege principle
- [ ] No publicly exposed storage buckets
- [ ] Network access restricted via firewall/security groups
- [ ] Secrets not stored in CI/CD logs
- [ ] HTTPS enforced at gateway/load balancer

---

## 🔍 11. API Gateway / Apigee Security (if applicable)

- [ ] Authentication policy configured
- [ ] Rate limiting / spike arrest applied
- [ ] API key verification enabled where required
- [ ] Message logging avoids sensitive data exposure
- [ ] Threat protection policies enabled

---

## 🧪 12. Test Coverage for Security

- [ ] Unit tests include security validation scenarios
- [ ] Negative test cases implemented
- [ ] Authentication failure scenarios tested
- [ ] Authorization checks validated

---

## 🤖 13. Agentic QA Validation Rules

AI Agents must verify:

- [ ] No secrets in code
- [ ] Static analysis security rules pass
- [ ] Checklist violations are flagged
- [ ] Missing validation logic identified
- [ ] Suggested remediation patches generated

---

## 🚨 14. Critical Blockers (Fail the PR)

- [ ] Hardcoded credentials detected
- [ ] Public unauthenticated endpoint
- [ ] Injection vulnerability present
- [ ] Sensitive data exposure
- [ ] High severity vulnerability in dependencies

---

## ✅ Approval Criteria

- [ ] All checklist items validated
- [ ] No critical security issues
- [ ] Code passes automated scans
- [ ] Unit tests cover security scenarios

---

## 📌 Notes for Agents

When using this checklist:

- Convert checklist into validation rules
- Map violations to code locations
- Suggest fixes as git patches
- Generate test cases for security scenarios
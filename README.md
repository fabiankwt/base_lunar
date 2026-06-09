# API Monitoramento Lunar

API REST desenvolvida em Java 17 com Spring Boot para monitoramento dos recursos de uma base lunar. Permite o gerenciamento de sensores, reservatórios, consumo de energia, climatização e alertas operacionais.

## Integrantes

| Nome | RM |
|------|----|
| Leonardo Martins Trevisan | 563752 |
| Guilherme Gama Massela | 563635 |
| Leonardo Eiji Fabian Kowata | 562934 |

---

API disponível em `http://localhost:8081`

---

## Endpoints

### Sensores — `/api/sensores`
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/sensores` | Lista todos os sensores |
| GET | `/api/sensores/{id}` | Busca sensor por ID |
| GET | `/api/sensores/alertas` | Sensores com leitura fora dos limites |
| POST | `/api/sensores` | Cadastra novo sensor |
| PUT | `/api/sensores/{id}` | Atualiza sensor |
| PATCH | `/api/sensores/{id}/leitura` | Registra nova leitura |
| DELETE | `/api/sensores/{id}` | Remove sensor |

### Reservatórios — `/api/reservatorios`
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/reservatorios` | Lista todos os reservatórios |
| GET | `/api/reservatorios/{id}` | Busca por ID |
| GET | `/api/reservatorios/nivel-baixo` | Reservatórios abaixo do limite |
| POST | `/api/reservatorios` | Cadastra novo reservatório |
| PUT | `/api/reservatorios/{id}` | Atualiza reservatório |
| PATCH | `/api/reservatorios/{id}/nivel` | Atualiza nível atual |
| DELETE | `/api/reservatorios/{id}` | Remove reservatório |

### Energia — `/api/energia`
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/energia` | Lista consumo de todos os setores |
| GET | `/api/energia/{id}` | Busca por ID |
| GET | `/api/energia/resumo` | Consumo total, geração e balanço |
| GET | `/api/energia/alerta` | Setores acima do limite |
| POST | `/api/energia` | Cadastra registro de consumo |
| PUT | `/api/energia/{id}` | Atualiza registro |
| DELETE | `/api/energia/{id}` | Remove registro |

### Climatização — `/api/climatizacao`
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/climatizacao` | Lista todos os sistemas |
| GET | `/api/climatizacao/{id}` | Busca por ID |
| POST | `/api/climatizacao` | Cadastra novo sistema |
| PUT | `/api/climatizacao/{id}` | Atualiza sistema |
| PATCH | `/api/climatizacao/{id}/acionar` | Liga ou desliga o sistema |
| PATCH | `/api/climatizacao/{id}/intensidade` | Ajusta intensidade (0-100%) |
| DELETE | `/api/climatizacao/{id}` | Remove sistema |

### Alertas — `/api/alertas`
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/alertas` | Lista todos os alertas |
| GET | `/api/alertas/{id}` | Busca por ID |
| GET | `/api/alertas/ativos` | Alertas ativos por severidade |
| POST | `/api/alertas` | Cria alerta manual |
| PUT | `/api/alertas/{id}` | Atualiza alerta |
| PATCH | `/api/alertas/{id}/reconhecer` | Reconhece o alerta |
| PATCH | `/api/alertas/{id}/resolver` | Resolve o alerta |
| DELETE | `/api/alertas/{id}` | Remove alerta |

### Dashboard — `/api/dashboard`
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/dashboard` | Resumo geral da base lunar |

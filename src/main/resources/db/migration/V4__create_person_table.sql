CREATE TABLE person (
                       id          BIGSERIAL PRIMARY KEY,
                       name       VARCHAR(255) NOT NULL,
                       member     BOOLEAN      NOT NULL DEFAULT FALSE,
                       created_at  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);
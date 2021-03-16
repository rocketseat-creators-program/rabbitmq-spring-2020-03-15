CREATE TABLE subscription (
  id varchar(255) NOT NULL PRIMARY KEY,
  status_id integer NOT NULL,
  created_at timestamp DEFAULT CURRENT_TIMESTAMP,
  updated_at timestamp DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE subscription
    ADD CONSTRAINT fk_registration_status
        FOREIGN KEY (status_id) REFERENCES status(id);


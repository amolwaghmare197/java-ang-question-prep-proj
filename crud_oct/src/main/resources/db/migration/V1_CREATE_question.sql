CREATE TABLE question (
                          id BIGINT PRIMARY KEY AUTO_INCREMENT,

                          technology_id BIGINT NOT NULL,

                          question TEXT NOT NULL,

                          answer LONGTEXT,

                          difficulty VARCHAR(20),

                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                              ON UPDATE CURRENT_TIMESTAMP,

                          CONSTRAINT fk_question_technology
                              FOREIGN KEY (technology_id)
                                  REFERENCES technology(id)
);
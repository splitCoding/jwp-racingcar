DROP TABLE IF EXISTS GAME CASCADE;

DROP TABLE IF EXISTS CAR CASCADE;

CREATE TABLE GAME
(
    id         INT      NOT NULL AUTO_INCREMENT,
    play_count INT      NOT NULL,
    created_at DATETIME NOT NULL default current_timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE CAR
(
    id        INT         NOT NULL AUTO_INCREMENT,
    name      VARCHAR(50) NOT NULL,
    position  INT         NOT NULL,
    game_id   INT         NOT NULL,
    is_winner BOOLEAN     NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (game_id) REFERENCES GAME (id)
)
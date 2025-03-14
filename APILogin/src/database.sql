CREATE TABLE IF NOT EXISTS users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(255) NOT NULL
);

-- Inserindo um usuário de teste
INSERT INTO users (username, password) VALUES 
('admin', '$2a$10$e2I4v/GFyBh0RXYRpyfkpOqM5GZbvl6fkgZR69/oyIQkmFvYv6q5S') 
ON CONFLICT (username) DO NOTHING;

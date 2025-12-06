-- 1. Quais são os nomes e cargos de todos os funcionários cadastrados?
SELECT f.nome, c.nome AS cargo
FROM Funcionario f
JOIN Cargo c ON f.id_cargo = c.id_cargo;

-- 2. Qual paciente tem o CPF '11122233344' e qual é sua data de nascimento?
SELECT nome, data_nascimento
FROM Paciente
WHERE cpf = '11122233344';

-- 3. Liste todos os remédios disponíveis no estoque e suas quantidades.
SELECT r.nome, e.quantidade, e.data_validade
FROM Estoque e
JOIN Remedio r ON e.id_remedio = r.id_remedio;

-- 4. Quais consultas foram realizadas no dia '2025-09-01' e qual foi o diagnóstico?
SELECT id_consulta, diagnostico
FROM Consulta
WHERE DATE(data_hora) = '2025-09-01';

-- 5. Qual funcionário está responsável pela sala número '101'?
SELECT s.numero, f.nome
FROM Sala s
JOIN Funcionario f ON s.id_funcionario = f.id_funcionario
WHERE s.numero = '101';

-- 6. Quais pacientes foram atendidos por 'Dra. Maria Souza'?
SELECT p.nome AS paciente, c.data_hora
FROM Consulta c
JOIN Paciente p ON c.id_paciente = p.id_paciente
JOIN Funcionario f ON c.id_funcionario = f.id_funcionario
WHERE f.nome = 'Dra. Maria Souza';

-- 7. Quais remédios foram prescritos na receita número '1' e qual a dosagem?
SELECT r.nome, rr.dosagem, rr.periodo
FROM Receita_Remedio rr
JOIN Remedio r ON rr.id_remedio = r.id_remedio
WHERE rr.id_receita = 1;

-- 8. Liste todos os usuários do sistema e seus papéis (role).
SELECT username, role, enabled
FROM usuario;

-- 9. Quais pacientes têm consultas registradas sem receita associada?
SELECT p.nome, c.id_consulta
FROM Consulta c
JOIN Paciente p ON c.id_paciente = p.id_paciente
WHERE c.id_receita IS NULL;

-- 10. Qual é a média de temperatura registrada nas consultas?
SELECT AVG(temperatura) AS media_temperatura
FROM Consulta;

-- 11. Quais funcionários possuem CRM cadastrado?
SELECT nome, crm
FROM Funcionario
WHERE crm IS NOT NULL;

-- 12. Quais pacientes nasceram antes de 1990?
SELECT nome, data_nascimento
FROM Paciente
WHERE data_nascimento < '1990-01-01';

-- 13. Quais remédios têm validade até o ano de '2026'?
SELECT r.nome, e.data_validade
FROM Estoque e
JOIN Remedio r ON e.id_remedio = r.id_remedio
WHERE EXTRACT(YEAR FROM e.data_validade) = 2026;

-- 14. Quais consultas foram realizadas na sala '102' e por qual funcionário?
SELECT c.id_consulta, f.nome AS funcionario, c.data_hora
FROM Consulta c
JOIN Sala s ON c.id_sala = s.id_sala
JOIN Funcionario f ON c.id_funcionario = f.id_funcionario
WHERE s.numero = '102';

-- 15. Liste todos os pacientes e o nome do médico responsável por suas receitas.
SELECT p.nome AS paciente, f.nome AS medico
FROM Receita r
JOIN Paciente p ON r.id_paciente = p.id_paciente
JOIN Funcionario f ON r.id_funcionario = f.id_funcionario;

-- 더미 데이터

-- User 데이터 추가
INSERT INTO user_table(name, account) VALUES ('초가스', '111-2222-3333');
INSERT INTO user_table(name, account) VALUES ('말파이트', '111-6666-5555');
INSERT INTO user_table(name, account) VALUES ('블리츠크랭크', '111-9999-4444');
INSERT INTO user_table(name, account) VALUES ('렉사이', '111-4343-8787');
INSERT INTO user_table(name, account) VALUES ('나르', '111-5555-0000');
INSERT INTO user_table(name, account) VALUES ('아무무', '111-2323-4432');

-- Party 데이터 추가
INSERT INTO party(user_id, party_title, party_description, created_at, max_count, category_id) VALUES (1, '칼바람 할사람', 'ㅈㄱㄴ', NOW(), 4, 2);
INSERT INTO party(user_id, party_title, party_description, created_at, max_count, category_id) VALUES (1, '공허', '공허 모여라', NOW(), 2, 3);
INSERT INTO party(user_id, party_title, party_description, created_at, max_count, category_id) VALUES (3, '인간시대의 끝이 도래했다', '하.하.하', NOW(), 3, 3);
INSERT INTO party(user_id, party_title, party_description, created_at, max_count, category_id) VALUES (1, '칼바람 할사람', 'ㅈㄱㄴ', NOW(), 4, 2);
INSERT INTO party(user_id, party_title, party_description, created_at, max_count, category_id) VALUES (5, '버스기사 모십니다', '버스 태워주세요', NOW(), 1, 2);
INSERT INTO party(user_id, party_title, party_description, created_at, max_count, category_id) VALUES (2, '배고파 죽겠다', '하.하.하', NOW(), 3, 1);
INSERT INTO party(user_id, party_title, party_description, created_at, max_count, category_id) VALUES (1, '칼바람 할사람', 'ㅈㄱㄴ', NOW(), 4, 2);
INSERT INTO party(user_id, party_title, party_description, created_at, max_count, category_id) VALUES (4, '공허', '공허 모여라', NOW(), 2, 1);
INSERT INTO party(user_id, party_title, party_description, created_at, max_count, category_id) VALUES (4, '인간시대의 끝이 도래했다2', '하.하.하.하.하.하.', NOW(), 3, 3);
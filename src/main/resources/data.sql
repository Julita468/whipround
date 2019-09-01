INSERT INTO WHIPROUND (id, description, goal) values (nextval('whip_seq'), 'Sweter dla Pana D.', 100);
INSERT INTO WHIPROUND (id, description, goal) values (nextval('whip_seq'), 'Karma dla Dogdao', 40);

INSERT INTO DONATION (id, whipround_id, amount, username, email) values (nextval('donation_seq'), 1, 10, 'Cezary', 'cezar@gmail.com');

commit;
insert into fornitore (id, nome) values (0, 'Amazon');
insert into fornitore (id, nome) values (1, 'eBay');

insert into categoria (id, descrizione) values (0, 'Abbigliamento');
insert into categoria (id, descrizione) values (1, 'Alimentari');
insert into categoria (id, descrizione) values (2, 'Elettronica');

insert into tag (id, nome) values (0, 'TV');
insert into tag (id, nome) values (1, 'HI-FI');

insert into prodotto (id, create_Date, descrizione, descrizione_breve, id_esterno, nome_prodotto, num_visualizzazioni, prezzo_listino, prezzo_offerta, testo_accessorio, update_date, url_esterna, fornitore) values (0, {ts '2012-09-17 18:47:52.69'}, 'Televisione Samsung 60 polici QLED e un sacco di altre minchiate. questo campo deve avere tante letterine.', 'TV QLED 60 e altre tre o quattro minchiate. Qualche letterina in meno del campo descrizione', '1224', 'EV60HD1200' , 120, 6000.00,5800.00, 'testo da visualizzare come alt o chissa che cazzo di altre ragioni',  {ts '2017-09-17 18:47:52.69'}, 'https://amaz.on/gekt23f', 0);
insert into prodotto (id, create_Date, descrizione, descrizione_breve, id_esterno, nome_prodotto, num_visualizzazioni, prezzo_listino, prezzo_offerta, testo_accessorio, update_date, url_esterna, fornitore) values (1, {ts '2013-09-17 18:47:52.69'}, 'Televisione Samsung 55 polici QLED e un sacco di altre minchiate. questo campo deve avere tante letterine.', 'TV QLED 55 e altre tre o quattro minchiate. Qualche letterina in meno del campo descrizione', '1221', 'EV55HD1000' , 93, 6000.00,5800.00, 'testo da visualizzare come alt o chissa che cazzo di altre ragioni',  {ts '2017-01-31 18:33:00.00'}, 'https://amaz.on/benrt5', 0);
insert into prodotto (id, create_Date, descrizione, descrizione_breve, id_esterno, nome_prodotto, num_visualizzazioni, prezzo_listino, prezzo_offerta, testo_accessorio, update_date, url_esterna, fornitore) values (2, {ts '2014-09-17 18:47:52.69'}, 'HI-FI DENON blah bòah blah', 'solo due blah', '1225', 'TAH12BOHM' , 37, 6000.00,5800.00, 'testo da visualizzare come alt o chissa che cazzo di altre ragioni',  {ts '2017-12-12 17:51:09.33'}, 'https://amaz.on/oiurt5', 0);

insert into prodotto_tag (prodotto_id, tag_id) values (0,0);
insert into prodotto_tag (prodotto_id, tag_id) values (1,0);
insert into prodotto_tag (prodotto_id, tag_id) values (2,1);


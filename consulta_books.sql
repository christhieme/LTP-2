USE books;

SELECT * FROM authors;

SELECT AuthorID, LastName FROM Authors;

SELECT Title, EditionNumber, Copyright
FROM Titles
WHERE Copyright > '2013';

SELECT AuthorID, FirstName, LastName
FROM Authors
WHERE LastName LIKE 'D%';

SELECT AuthorID, FirstName, LastName
FROM Authors
WHERE LastName LIKE '_o%';

SELECT AuthorID, FirstName, LastName
FROM Authors
ORDER BY LastName ASC;

SELECT AuthorID, FirstName, LastName
FROM Authors
ORDER BY LastName DESC;

SELECT AuthorID, FirstName, LastName
FROM Authors
ORDER BY LastName, FirstName;

SELECT ISBN, Title, EditionNumber, Copyright
FROM Titles
WHERE Title LIKE '%How to Program'
ORDER BY Title ASC;

SELECT FirstName, LastName, ISBN
FROM Authors
INNER JOIN AuthorISBN
	ON Authors.AuthorID = AuthorISBN.AuthorID
ORDER BY LastName, FirstName;

INSERT INTO Authors (FirstName, Lastname)
VALUES ('Sue', 'Red');

UPDATE Authors
SET LastName = 'Black'
WHERE LastName = 'Red' AND FirstName = 'Sue';

UPDATE Authors
SET LastName = 'Black'
WHERE AuthorID = '6';

DELETE FROM Authors
WHERE LastName = 'Black' AND FirstName = 'Sue';

DELETE FROM Authors
WHERE AuthorID >= '7';

  




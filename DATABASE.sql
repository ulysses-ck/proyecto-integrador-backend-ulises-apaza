USE test;

CREATE TABLE IF NOT EXISTS Users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50),
  aboutMe TEXT,
  email VARCHAR(50),
  password VARCHAR(50),
  photoProfile VARCHAR(1024)
);

CREATE TABLE IF NOT EXISTS Education (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    logo VARCHAR(255),
    nameInstitution VARCHAR(255),
    startDate DATE,
    finishDate DATE,
    idUser INT,
    FOREIGN KEY (idUser) REFERENCES Users(id)
);

CREATE TABLE IF NOT EXISTS Experience (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titleJob VARCHAR(255),
    nameCompany VARCHAR(255),
    workingDay VARCHAR(255),
    jobDescription TEXT,
	 idUser INT,
    FOREIGN KEY (idUser) REFERENCES Users(id)
);

CREATE TABLE IF NOT EXISTS Project (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    urlDemo VARCHAR(255),
    urlGithub VARCHAR(255),
	 idUser INT,
    FOREIGN KEY (id) REFERENCES Users(id)
);

CREATE TABLE IF NOT EXISTS Skill (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    domainPercentage INT,
    accentColor VARCHAR(255),
	 idUser INT,
    FOREIGN KEY (id) REFERENCES Users(id)test
);
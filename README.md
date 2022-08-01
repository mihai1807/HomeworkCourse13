# HomeworkCourse13
 

Sa se adauge clasele din diagrama de mai sus. 
1.	Clasa Person: // reprezinta o persoana
●	String name;
●	String address;
●	constructor care primeste argumente pentru cele doua campuri
●	metoda toString() care returneaza un String ce reprezinta informatiile despre persoana curenta, intr-un mod lizibil.

2.	Clasa Student// mosteneste Person, reprezinta un student
●	int nrOfCourses; // nr de cursuri
●	String[] courses; // cursurile in sine. Va fi un array de dimensiune 3 (Consideram ca un student nu poate avea mai mult de 3 cursuri)
●	int nrOfGrades; // numarul de note.
●	Grade[] grades; // notele in sine. Va fi un array de dimensiune 10. (Consideram ca un student nu poate avea mai mult de 10 note)
●	constructor care primeste parametrii doar pentru nume si adresa
●	void addCourse(String); // incearca sa adauge cursul primit ca param studentului. Daca studentul are deja 3 cursuri, se va arunca CantAddElementException
●	addCourseGrade(String course, int grade); // Se va crea un obiect de tip Grade cu cei doi parametrii si se va incerca adaugarea acestuia in array-ul cu note. Daca array-ul este plin (sunt deja 10 elemente), vom arunca CantAddElementException
●	printGrades(); // afiseaza toate notele pentru toate cursurile.
●	printCourses(); // afiseza toate cursurile
●	getAverageGradeForCourse(String course);// primeste ca param cursul si cauta in array-ul de obiecte Grade cele ce au courseName egal cu parametrul primit. Pentru aceste note se va calcula si returna media. Observatie: se va folosi metoda equals() pentru a verifica egalitatea dintre doua stringuri. Daca am String nameA si String nameB, daca vreau sa verific ca cele doua sunt egale, voi apela: nameA.equals(nameB), iar rezultatul va fi true sau false.
●	toString(); // suprascrie metoda din clasa parinte si afiseaza: “Studentul ” + numeStudent + “ cu adresa “ + adresa + “ este inscris la “ + nrCursuri + “ cursuri si are ” + nrNote + “ note”

3.	Clasa Teacher// mosteneste Person, reprezinta un profesor
●	int nrOfCourses; // numarul de cursuri
●	String[] courses; // cursurile in sine. Similar, un profesor poate preda maximum 3 cursuri, deci va fi un array de 3 stirnguri. 
●	addCourse(String course); // incearca adaugarea cursului. Daca sunt deja 3 cursuri, se arunca CantAddElementException
●	printCourses(); // sunt afisate cursurile profesorului
●	toString(); // sa se adauge si numarul de cursuri, comparativ cu metoda din clasa parinte

4.	Clasa Grade // reprezinta o nota
●	String courseName; // numele cursului
●	int grade; // nota in sine
●	constructor pentru cele doua campuri.

5.	Clasa CantAddElementException // exceptie de tip checked
6.	Sa se instantieze mai multe instante de Studenti si Profesor, cu diverse cursuri si note si sa se observe comportamentul. 
EXTRA
7.	Sa se creeze clasa Catalog care reprezinta o Resursa. 
●	constructor fara param
●	void scrieNote(Student student); // scrie toate notele studentului primit ca parametru. Daca vreuna dintre note este in afara intervalului [1, 10] se va arunca InvalidGradeException (exceptie proprie de tip checked). Pentru ca nu avem unde “sa scriem” notele, doar le vom afisa, alaturi de numele cursului si numele studentului
●	void scrieNote(Student student, String courseName); // scrie notele studentului doar pentru cursul cu numele courseName. Se va face aceeasi validare ca mai sus. 
●	void scrieNote(Student[] students); // scrie toate notele pentru toti studentii, adaugandu-se aceeasi validare - daca vreo nota este invalida, se va arunca exceptia potrivita. 
●	void scrieNote(Student[] students, String courseName); // se vor afisa notele stundentilor pentru cursul respectiv, facandu-se aceleasi validari
●	close() // inchide catalogul  
8.	Sa se creeze un obiect de tip Catalog. Sa se scrie notele studentilor creati anterior. 


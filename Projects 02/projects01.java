import java.util.Scanner;

class Books {
	String book_title;
	String author_name;

	Books(String t, String nm) {
		this.book_title = t;
		this.author_name = nm;
	}

	String get_Tittle() {
		return book_title;
	}

	String get_Author() {
		return author_name;
	}
}

class BookDetails extends Books {
	double price;
	int current_stock;

	BookDetails(String t, String nm, double p, int s) {
		super(t, nm);
		price = p;
		current_stock = s;
	}

	void display() {
		System.out.println(book_title + "\t" + author_name + "\t" + price + '\t' + current_stock);
	}

	void update() {
		System.out.println("Enter the new Stock value :-");
		Scanner in = new Scanner(System.in);
		int new_stock = in.nextInt();
		current_stock = new_stock;
	}
}

public class projects01 {
	public static void main(String[] args) {
		BookDetails b[] = new BookDetails[3];
		b[0] = new BookDetails("aaa", "xxx", 296, 10);
		b[1] = new BookDetails("bbb", "biii", 345, 10);
		b[2] = new BookDetails("ccc", "vvv", 40000, 20);

		System.out.println("\n\t\t Book records");
		System.out.println("Tittle\tAuthor\tPrice\tStock");

		for (int i = 0; i < b.length; i++) {
			b[i].display();
		}

		// query for searching using book title
		System.out.println("\n Enter the author name her for the searching the book record :- ");
		Scanner input = new Scanner(System.in);
		String title = input.nextLine();
		for (int i = 0; i < b.length; i++) {
			if (title.equals(b[i].get_Tittle())) {
				System.out.println("the given book is present :-");
				System.out.println("Title\tAuthor\tPrice\tStock");
				b[i].display();
				break;
			}
		}
		// query for searching using author name
		System.out.println("\nEnter author of the book for searching the record :-");
		input = new Scanner(System.in);
		String author = input.nextLine();
		for (int i = 0; i < b.length; i++) {
			if (author.equals(b[i].get_Author())) {
				System.out.println("The given book is present:-");
				System.out.println("Title\tAuthor\tPrice\tStock");
				b[i].display();
				break;
			}
		}
		// query for searching using book title 
		System.out.println("\n Enter title of the book for updating the stock");
		input = new Scanner(System.in);
		title = input.nextLine();
		for (int i = 0; i < b.length; i++) {
			if (title.equals(b[i].get_Tittle())) {
				b[i].update();
			}
		}

		System.out.println("\n\t\t Book records");
		System.out.println("Title\tAuthor\tPrice\tStock");
		for (int i = 0; i < b.length; i++) {
			b[i].display();
		}
		input.close();
	}
}
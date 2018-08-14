class BookDemo{
	public static void main(String[] args) {
		Author author=new Author("m","m");
		author.setFirstName("Manohar");
		author.setLastName("Moni");
		Book book=new Book("c",author,8410);
		book.setTitle("I Will Be an Developer");
		book.setAuthor(author);
		book.setPrice(5000);
		System.out.println(book.toString());
	}
}
package iterator;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("aaa"));
		bookShelf.appendBook(new Book("bbb"));
		bookShelf.appendBook(new Book("ccc"));
		bookShelf.appendBook(new Book("ddd"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}

}

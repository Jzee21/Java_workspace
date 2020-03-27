package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

import day10.ex.Book;

//import java.util.Arrays;

public class BookMgr {
	
	private Set<Book> list;
	
	
	public BookMgr() {
		this.list = new HashSet<Book>();
	}
	
	// add
	public void add() {
		System.out.println("======= Add Book =======");
		String title = JOptionPane.showInputDialog("추가하실 책의 제목을 입력하세요.");
		String price = JOptionPane.showInputDialog("추가하실 가격을 입력하세요.","숫자");
		Book book = new Book(title, Integer.parseInt(price));
		if(this.list.add(book))
			System.out.println("Add " + book);
		else
			System.out.println("Faile");
		System.out.println("========================");
	}
	
	// delete
	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== Delete ========");
		String title = JOptionPane.showInputDialog("삭제하실 책의 제목을 입력하세요.");
		Iterator<Book> it = this.list.iterator();
		System.out.println("========= List =========");
		while (it.hasNext()) {
			Book data = (Book) it.next();
			if (data.getTitle().toLowerCase().contains(title.toLowerCase())) {
				System.out.println(data);
			}
		}
		System.out.println("======== Delete? =======");
		it = this.list.iterator();
		while (it.hasNext()) {
			Book data = (Book) it.next();
			if (data.getTitle().toLowerCase().contains(title.toLowerCase())) {
				System.out.print(data + " >> Delete? y/n");
				if (sc.nextLine().trim().toLowerCase().equals("y"))
					it.remove();
			}
		}
		sc.close();
		sc = null;
		System.out.println("========================");
	}
	
	// search
	public void search() {
		System.out.println("======== Search ========");
		String msg = JOptionPane.showInputDialog("검색하실 책의 검색어를 입력하세요.");
		System.out.printf("검색어 : %s", msg);
		System.out.println("======== Result ========");
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = (Book)it.next();
			if(data.getTitle().toLowerCase().contains(msg.toLowerCase())) {
				System.out.println(data);
			}
		}
		System.out.println("========================");
	}
	
	// edit
	public void edit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= Edit =========");
		String ans = JOptionPane.showInputDialog("수정하실 책의 제목을 입력하세요.");
		Iterator<Book> it = this.list.iterator();
		System.out.println("========= List =========");
		while (it.hasNext()) {
			Book data = (Book) it.next();
			if (data.getTitle().toLowerCase().contains(ans.toLowerCase())) {
				System.out.println(data);
			}
		}
		System.out.println("========= Edit? ========");
		it = this.list.iterator();
		while (it.hasNext()) {
			Book data = (Book) it.next();
			if (data.getTitle().toLowerCase().contains(ans.toLowerCase())) {
				System.out.print(data + " >> 제목을 수정하십니까? y/n");
				if (sc.nextLine().trim().toLowerCase().equals("y")) {
					ans = JOptionPane.showInputDialog("수정하실 책의 제목을 입력하세요.");
					data.setTitle(ans);
				}
				System.out.print(data + " >> 가격을 수정하십니까? y/n");
				if (sc.nextLine().trim().toLowerCase().equals("y")) {
					ans = JOptionPane.showInputDialog("수정하실 책의 가격을 입력하세요.");
					data.setPrice(Integer.parseInt(ans));
				}	
			}
		}
		sc.close();
		sc = null;
		System.out.println("========================");
	}
	
	// list
	public void printList() {
		System.out.println("========= List =========");
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = (Book) it.next();
			System.out.println(data);
		}
		System.out.println("========================");
	}
	// toString : return "[title=" + title + ", price=" + price + "]";
	
	public <T> void test(T book, int num) {
		
	}
	
	
	
	// exit
	
}

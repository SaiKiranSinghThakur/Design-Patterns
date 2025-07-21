package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<String> images = new ArrayList<>();
		images.add("Image1.png");

		List<String> annotations = new ArrayList<>();
		annotations.add("Annotations1");

		Document originalDoc = new Document(" Hello, World! ", images, " Basic ", annotations);

		// Cloning the document using prototype pattern.
		DocumentPrototype copiedDoc = (Document) originalDoc.cloneDocument();

		// adding image and annotation to original document.
		originalDoc.addImage("Image2.png");
		originalDoc.addAnnotation("Annotation2");

		// display documents.
		System.out.println("Original Document: ");
		System.out.println("--------------------------------------");
		originalDoc.display();

		System.out.println("--------------------------------------");
		System.out.println("                      ");
		System.out.println("-----------------------");
		
		System.out.println("Copied Document: ");
		System.out.println("-----------------------");
		copiedDoc.display();

	}

}

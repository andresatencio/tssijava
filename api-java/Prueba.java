import java.io.IOException;
public class Prueba {

public static void main(String[] args) throws IOException {
	
	
	
	String node = "http://nodesms.aws.cm/admin/api/a@a.com";
	String local = "http://localhost:3000/admin/api/a@a.com";
	

	PeticionPost post = new PeticionPost (node);
	
	post.add("email", "a@a.com");
	post.add("pass", "1");
	post.add("tel", "123456");
	post.add("msg", "Holaaaaaaaaaaaaaaa");
	post.add("nombre", "java");
	
	String respuesta = post.getRespueta();
	System.out.println(respuesta);
	}

}
package github.lugom.Dump.classes;

public class Rooms 
{
	private String nome;
	private String email;
	
	public Rooms(String nome, String email) 
	{
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() 
	{
		return  nome + ", " + email;
	}
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
}

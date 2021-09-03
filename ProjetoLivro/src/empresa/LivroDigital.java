package empresa;

public class LivroDigital extends Livro{
	private int download;
	private double tamanho;
	
	public int getDowload() {
		return download;
	}
	public void setDowload(int dowload) {
		this.download = dowload;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public LivroDigital(String titulo, Autor autor, String genero, int edicao, int dowload, double tamanho) {
		super(titulo, autor, genero, edicao);
		this.download = dowload;
		this.tamanho = tamanho;
	}
    
	public LivroDigital() {
		
	}
	@Override//sobrescreve uma classe mae
	public void info() {
		super.info();
		System.out.println("Download: " + download);
		System.out.println("Tamanho: " + tamanho);
		
	}
}

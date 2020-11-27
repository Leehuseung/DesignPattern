package factoryMethod.groupware;

import factoryMethod.framework.Product;

public class GroupWare extends Product{
	
	private String project;
	
	GroupWare(String project){
		System.out.println(project+"프로젝트를 만듭니다.");
		this.project = project;
	}

	public void start() {
		System.out.println("그룹웨어 시작");
	}
	
	public String getProject() {
		return project;
		
	}

}
	
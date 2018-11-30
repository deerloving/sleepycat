package com.king.oracle;
/**
 * emp表实体类
 * @author OneKing
 *
 */
public class Employee {

	/**
	 * 员工号
	 */
	private int empno;
	
	/**
	 * 员工名称
	 */
	private String ename;
	
	/**
	 * 职位
	 */
	private String job;
	
	/**
	 * 经理号
	 */
	private int mgr;
	
	/**
	 * 雇佣日期
	 */
	private String hiredate;
	
	/**
	 * 薪水
	 */
	private double sal;
	
	/**
	 * 奖金
	 */
	private double comm;
	
	/**
	 * 部门号
	 */
	private int deptno;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}

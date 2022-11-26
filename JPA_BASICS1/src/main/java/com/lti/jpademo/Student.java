package com.lti.jpademo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
//2 annotations are compulsory
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS")
public class Student {

	@Id // prim key // only for one field
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stuSeqGen")
	@SequenceGenerator(name = "stuSeq", sequenceName = "stuSeq", allocationSize = 1)
	@Column(name = "STUID")
	private int stuId;

	@Column(name = "STUNAME", length = 10)
	private String stuName;

	@Column(name = "SCORE")
	private int score;

	// constructors def constructors//getter setter//tostring

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String stuName, int score) {
		super();
		this.stuName = stuName;
		this.score = score;
	}

	public Student(int stuId, String stuName, int score) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.score = score;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", score=" + score + "]";
	}

}

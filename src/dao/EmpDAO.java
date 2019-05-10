package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import vo.EmpVO;

public class EmpDAO {
	private String fileName;

	public EmpDAO(String fileName) {
		this.fileName = fileName;
	}
	public List<EmpVO> getAll(){
		ArrayList<EmpVO> list = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(new File(fileName)))){

			String line;
            //�w�b�_�[�\��

            int check = 0;
            while((line = in.readLine()) != null){
            	String[] data = line.split(",");
            	EmpVO str = new EmpVO();
            	str.setSyainNumber(data[0]);
            	str.setName(data[1]);
            	str.setHeight(data[2]);
            	str.setWeight(data[3]);
            	list.add(str);
            	check ++;

            	}
            if(check == 0) {
            	return null;
            }

        }catch (IOException e) {
            e.printStackTrace();
        }return list;
	}
	public EmpVO get(int syainNumber) {

		try (BufferedReader in = new BufferedReader(new FileReader(new File(fileName)))){

			String line;
            while((line = in.readLine()) != null){

            	String[] data = line.split(",");
            	if(syainNumber == Integer.parseInt(data[0])){
            		EmpVO vo = new EmpVO();
            		vo.setSyainNumber(data[0]);
            		vo.setName(data[1]);
            		vo.setHeight(data[2]);
            		vo.setWeight(data[3]);

            		return vo;

            	}

            }
		}catch (IOException e) {
            e.printStackTrace();
        }return null;
	}
	//�Ј����ǉ�
	public void insert(EmpVO empVO) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(fileName,true);
			bw = new BufferedWriter(fw);
			bw.write(empVO.getSyainNumber() + ",");
			bw.write(empVO.getName() + ",");
			bw.write(empVO.getHeight() + ",");
			bw.write(empVO.getWeight());
			bw.newLine();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(fileName + "�t�@�C�������݂��܂���");
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
			}catch(Exception e){
			}

		}
	}
	//���폜
	public void delete(EmpVO empVO) {
		//getAll��list�擾
		int cnt = 0;
		List<EmpVO> list = getAll();
		//��v������̂�T��
		for(EmpVO vo:list) {
			if(empVO.getSyainNumber().equals(vo.getSyainNumber())){
				break;
			}
			cnt ++;
		}
		//list���̊Y���Ј��̏��폜
		list.remove(cnt);

		//list�̓��e�f�[�^���㏑��
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(fileName,false);
			bw = new BufferedWriter(fw);
			for(EmpVO vo : list) {
				bw.write(vo.getSyainNumber() + ",");
				bw.write(vo.getName() + ",");
				bw.write(vo.getHeight() + ",");
				bw.write(vo.getWeight());
				bw.newLine();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(fileName + "�t�@�C�������݂��܂���");
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
			}catch(Exception e){
			}
		}
	}
	public void update(EmpVO empVO) {
		//getAll��list�擾
		int cnt = 0;
		List<EmpVO> list = getAll();
		//��v������̂�T��
		for(EmpVO vo:list) {
			if(empVO.getSyainNumber().equals(vo.getSyainNumber())){
				break;
			}
			cnt ++;
		}
		//list���̊Y���Ј��̏��ύX
		list.set(cnt, empVO);

		//�Ј������㏑������
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(fileName,false);
			bw = new BufferedWriter(fw);
			for(EmpVO vo : list) {
				bw.write(vo.getSyainNumber() + ",");
				bw.write(vo.getName() + ",");
				bw.write(vo.getHeight() + ",");
				bw.write(vo.getWeight());
				bw.newLine();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(fileName + "�t�@�C�������݂��܂���");
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if(bw != null) {
					bw.close();
				}
			}catch(Exception e){
			}
		}
	}
	public void updateAll()

}

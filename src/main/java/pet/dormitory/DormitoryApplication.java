package pet.dormitory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DormitoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DormitoryApplication.class, args);
	}

}

//Университет
//1.    ID
//
//2.    Название
//
//3.    Длительность обучения
//
//
//
//Общежитие
//1.    ID
//
//2.    Номер
//
//3.    Количество комнат
//
//4.    Университет
//
//5.    Доступность для проживания
//
//
//
//Комната
//1.    ID
//
//2.    Номер
//
//3.    Общежитие
//
//4.    Вместимость
//
//5.    Доступность для проживания
//
//6.    Пол проживающих
//
//
//
//Студент
//1.    ID
//
//2.    ФИО
//
//3.    Пол
//
//4.    Университет
//
//5.    Общежитие
//
//6.    Комната
//
//7.    Год поступления
//
//8.    Дата отчисления
//
//9.    Проживает ли в общежитии
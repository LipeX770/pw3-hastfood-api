package br.com.pw3hastfood.entity;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.pw3hasfood.enums.DiaSemanaEnum;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "TBL_HORARIO_FUNCIONAMENTO")
	public class HorarioFuncionamento {

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Enumerated(EnumType.STRING)
		@Column (name = "TX_DIA_SEMANA")
		private DiaSemanaEnum diaSemana;
		
		@Column (name = "HR_ABERTURA")
		private LocalDate horaAbertura;
		
		@Column (name = "HR_FECHAMENTO")
		private LocalDate horaFechamento;
		
		@ManyToOne
		@Column (name = "ID_RESTAURANTE")
		private Restaurante Restaurante;
		
	}

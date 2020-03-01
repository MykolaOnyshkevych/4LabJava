package ua.lviv.iot.gym.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.gym.model.AbstractExerciseMachine;
import ua.lviv.iot.gym.model.SortType;



public class GymManagerUtils {
	private static final PricePerHourComparator PRICE_PER_HOUR_COMPARATOR = new PricePerHourComparator();

	private static class PricePerHourComparator implements Comparator<AbstractExerciseMachine> {

		@Override
		public int compare(AbstractExerciseMachine exerciseMachineFirst, AbstractExerciseMachine exerciseMachineSecond) {
			return (int) (exerciseMachineFirst.getPricePerHour() - exerciseMachineSecond.getPricePerHour());
		}

	}

	private class ProducingCountryComparator implements Comparator<AbstractExerciseMachine> {

		@Override
		public int compare(AbstractExerciseMachine exerciseMachineFirst, AbstractExerciseMachine exerciseMachineSecond) {
			return (int) exerciseMachineFirst.getProducingCountry().compareTo(exerciseMachineSecond.getProducingCountry());
		}

	}

	public static void sortExerciseMachinesByPrice(List<AbstractExerciseMachine> exerciseMachine, SortType sortType) {
		exerciseMachine.sort(
				sortType == SortType.ASCENDING ? PRICE_PER_HOUR_COMPARATOR : PRICE_PER_HOUR_COMPARATOR.reversed());
	}

	public static void sortByProducingCountry(List<AbstractExerciseMachine> exerciseMachines, SortType sortType) {
		switch (sortType) {
		case ASCENDING:
			exerciseMachines.sort(new GymManagerUtils().new ProducingCountryComparator());
			break;
		case DESCENDING:
			exerciseMachines.sort(new GymManagerUtils().new ProducingCountryComparator().reversed());
			break;
		default:
			break;
		}

	}

	public static void sortByModel(List<AbstractExerciseMachine> exerciseMachine, SortType sortType) {
		Comparator<AbstractExerciseMachine> modelComparator = new Comparator<AbstractExerciseMachine>() {

			@Override
			public int compare(AbstractExerciseMachine exerciseMachineFirst, AbstractExerciseMachine exerciseMachineSecond) {
				return (int) (exerciseMachineFirst.getModel().compareTo(exerciseMachineSecond.getModel()));
			}

		};

		exerciseMachine.sort(sortType == SortType.ASCENDING ? modelComparator : modelComparator.reversed());
	}

	public static void sortExerciseMachinesByDuration(List<AbstractExerciseMachine> exerciseMachines, SortType sortType) {
		switch (sortType) {
		case ASCENDING:
			exerciseMachines.sort((AbstractExerciseMachine exerciseMachineFirst,
					AbstractExerciseMachine exerciseMachineSecond) -> (int) (exerciseMachineFirst.getDurationInMinutes()
							- exerciseMachineSecond.getDurationInMinutes()));
			break;
		case DESCENDING:
			exerciseMachines.sort((AbstractExerciseMachine exerciseMachineFirst,
					AbstractExerciseMachine exerciseMachineSecond) -> (int) (exerciseMachineSecond.getDurationInMinutes() - exerciseMachineFirst.getDurationInMinutes()));
			break;
		default:
			break;
		}
	}
}

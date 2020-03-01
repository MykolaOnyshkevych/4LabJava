package ua.lviv.iot.gym;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.gym.manager.GymManagerUtils;
import ua.lviv.iot.gym.model.SortType;

public class GymManagerUtilsTest extends BaseExerciseMachineManagerTest{
	@Test
	public void testSortByPriceAsc() {
		GymManagerUtils.sortExerciseMachinesByPrice(exerciseMachineList, SortType.DESCENDING);
		assertEquals(125.0, exerciseMachineList.get(0).getPricePerHour());
		assertEquals(55.0, exerciseMachineList.get(1).getPricePerHour());
		assertEquals(25.0, exerciseMachineList.get(2).getPricePerHour());
	}
	@Test
	public void testSortByModelDes() {
		GymManagerUtils.sortByModel(exerciseMachineList, SortType.ASCENDING);
		assertEquals("Beria-2000", exerciseMachineList.get(0).getModel());
		assertEquals("Chin-Chong", exerciseMachineList.get(1).getModel());
		assertEquals("G-13", exerciseMachineList.get(2).getModel());
	}
	@Test
	public void testSortByProducingCountry() {
		GymManagerUtils.sortByProducingCountry(exerciseMachineList, SortType.ASCENDING);
		assertEquals("China", exerciseMachineList.get(0).getProducingCountry());
		assertEquals("Christiania", exerciseMachineList.get(1).getProducingCountry());
		assertEquals("USSR", exerciseMachineList.get(2).getProducingCountry());
	}
	@Test
	public void testSortByDuration() {
		GymManagerUtils.sortExerciseMachinesByDuration(exerciseMachineList, SortType.DESCENDING);
		assertEquals(84, exerciseMachineList.get(0).getDurationInMinutes());
		assertEquals(78, exerciseMachineList.get(1).getDurationInMinutes());
		assertEquals(12, exerciseMachineList.get(2).getDurationInMinutes());
	}
}

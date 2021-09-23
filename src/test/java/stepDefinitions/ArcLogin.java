package stepDefinitions;

import Base.ArcBase;
import PageActions.ArcPageActions;
import PageObjects.ArcPageObjects;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ArcLogin
{
	
	ArcPageActions arcaction = new ArcPageActions();
	ArcPageObjects arcobject = new ArcPageObjects();
	ArcBase arc = new ArcBase();
	
	@Given("^User has logged in to ARC application using valid user credentials$")
	public void user_has_logged_in_to_ARC_application_using_valid_user_credentials() throws Throwable
	{
		arc.ChromeInitiation(); 
	}

	@When("^User clicks on Points and print the top points in Leaderboard$")
	public void user_clicks_on_Points_and_print_the_top_points_in_Leaderboard() throws Throwable
	{	
		arcobject.PointsClick();
	}

	@And("^User clicks on Rank and print the top rank in Leaderboard$")
	public void user_clicks_on_Rank_and_print_the_top_rank_in_Leaderboard() throws Throwable
	{		
	    arcobject.RankClick();
	}

	@And("^User navigate to Career Advancement Framework screen$")
	public void user_navigate_to_Career_Advancement_Framework_screen() throws Throwable
	{
	    arcaction.Career_Development();
	}

	@And("^User selects QA from the drop down$")
	public void user_selects_QA_from_the_drop_down() throws Throwable
	{
	    arcaction.RolesCompetencies();
	}

	@Then("^User prints the Roles and Competencies for all designation available in QA$")
	public void user_prints_the_Roles_and_Competencies_for_all_designation_available_in_QA() throws Throwable
	{
		arcobject.RolesCompetenciesPrint();
	}

}

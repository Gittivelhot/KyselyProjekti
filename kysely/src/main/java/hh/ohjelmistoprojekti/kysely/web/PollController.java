package hh.ohjelmistoprojekti.kysely.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.ohjelmistoprojekti.kysely.domain.Poll;
import hh.ohjelmistoprojekti.kysely.domain.PollRepository;

@Controller
public class PollController {

	@Autowired
	private PollRepository prepository;

	@RequestMapping(value = "/newpoll", method = RequestMethod.GET)

	public String getNewPoll(Model model) {
		model.addAttribute("poll", new Poll());
		return "addquestion";
	}

	@RequestMapping(value = "/savepoll", method = RequestMethod.POST)
	public String savePoll(@ModelAttribute Poll poll) {
		prepository.save(poll);
		return "redirect:/questionlist";
	}

	@RequestMapping(value = "/polls", method = RequestMethod.GET)
	public String getPolls(Model model) {
		List<Poll> polls = (List<Poll>) prepository.findAll();
		model.addAttribute("polls", polls);
		return "questionlist";
	}
}
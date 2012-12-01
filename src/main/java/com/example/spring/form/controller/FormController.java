package com.example.spring.form.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.spring.form.dto.Book;
import com.example.spring.form.model.CheckboxModel;
import com.example.spring.form.model.CheckboxesModel;
import com.example.spring.form.model.InputModel;
import com.example.spring.form.model.OptionsModel;
import com.example.spring.form.model.PasswordModel;
import com.example.spring.form.model.RadiobuttonModel;
import com.example.spring.form.model.RadiobuttonsModel;
import com.example.spring.form.model.SelectModel;
import com.example.spring.form.model.TextareaModel;

@Controller
public class FormController {
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/checkbox", method = RequestMethod.GET)
	public String checkbox(Model model) {
		CheckboxModel cm = new CheckboxModel();
		cm.setSendMail(true);
		model.addAttribute("checkboxModel", cm);

		return "checkbox";
	}

	@RequestMapping(value = "/checkboxes", method = RequestMethod.GET)
	public String checkboxes(Model model) {
		List<Book> books = new ArrayList<>();

		books.add(new Book("1234567890", "Spring入門"));
		books.add(new Book("1111111111", "Java入門"));
		books.add(new Book("9999999999", "Servlet/JSP入門"));

		CheckboxesModel cm = new CheckboxesModel();
		// 初期値の設定
		cm.setSelectedIsbns(new String[] { "1111111111" });
		model.addAttribute("checkboxesModel", cm);
		model.addAttribute("books", books);

		return "checkboxes";
	}

	@RequestMapping(value = "/checkboxesPost", method = RequestMethod.GET)
	public String checkboxesPost(@ModelAttribute CheckboxesModel checkboxesModel) {

		for (String s : checkboxesModel.getSelectedIsbns()) {
			System.out.println(s);
		}

		return "forward:/checkboxes";
	}

	@RequestMapping(value = "/radiobutton", method = RequestMethod.GET)
	public String Radiobutton(Model model) {
		RadiobuttonModel rm = new RadiobuttonModel();
		rm.setSendMail("send");
		model.addAttribute("radiobuttonModel", rm);

		return "radiobutton";
	}

	@RequestMapping(value = "/radiobuttons", method = RequestMethod.GET)
	public String Radiobuttons(Model model) {
		List<Book> books = new ArrayList<>();

		books.add(new Book("1234567890", "Spring入門"));
		books.add(new Book("1111111111", "Java入門"));
		books.add(new Book("9999999999", "Servlet/JSP入門"));

		RadiobuttonsModel rm = new RadiobuttonsModel();
		rm.setSelectedIsbn("9999999999");
		model.addAttribute("radiobuttonsModel", rm);
		model.addAttribute("books", books);

		return "radiobuttons";
	}

	@ModelAttribute("inputModel")
	public InputModel initInputModel() {
		return new InputModel();
	}

	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Model model) {
		InputModel im = new InputModel();
		im.setName("花中島　太郎");
		model.addAttribute("inputModel", im);

		return "input";
	}

	@RequestMapping(value = "/inputSend", method = RequestMethod.POST)
	public String inputSend(
			@Valid @ModelAttribute("inputModel") InputModel inputModel,
			Errors errors) {
		if (errors.hasErrors()) {
			return "input";
		}

		return "forward:/";
	}

	@RequestMapping(value = "/password", method = RequestMethod.GET)
	public String password(Model model) {
		PasswordModel pm = new PasswordModel();
		model.addAttribute("passwordModel", pm);

		return "password";
	}

	@RequestMapping(value = "/textarea", method = RequestMethod.GET)
	public String textarea(Model model) {
		TextareaModel tm = new TextareaModel();
		model.addAttribute("textareaModel", tm);

		return "textarea";
	}

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public String select(Model model) {
		List<Book> books = new ArrayList<>();

		books.add(new Book("1234567890", "Spring入門"));
		books.add(new Book("1111111111", "Java入門"));
		books.add(new Book("9999999999", "Servlet/JSP入門"));

		SelectModel sm = new SelectModel();
		sm.setSelectedIsbn("1111111111");
		List<String> selectedIsbns = new ArrayList<String>();
		selectedIsbns.add("1234567890");
		selectedIsbns.add("9999999999");
		sm.setSelectedIsbns(selectedIsbns);
		model.addAttribute("selectModel", sm);
		model.addAttribute("books", books);

		return "select";
	}

	@RequestMapping(value = "/options", method = RequestMethod.GET)
	public String options(Model model) {
		List<Book> books = new ArrayList<>();

		books.add(new Book("1234567890", "Spring入門"));
		books.add(new Book("1111111111", "Java入門"));
		books.add(new Book("9999999999", "Servlet/JSP入門"));

		OptionsModel om = new OptionsModel();
		om.setSelectedIsbn("9999999999");
		model.addAttribute("optionsModel", om);
		model.addAttribute("books", books);

		return "options";
	}

}

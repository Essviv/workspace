package com.cmcc.sunyiwei;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagLearning extends SimpleTagSupport {
	List<Movie> movieList;
	
	@Override
	public void doTag() throws JspException, IOException {
		for (Movie movie : movieList) {
			getJspContext().setAttribute("movie", movie);
			getJspBody().invoke(null);
		}
		
		throw new SkipPageException();
//		throw new JspException();
	}



	public List<Movie> getMovieList() {
		return movieList;
	}



	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	
}

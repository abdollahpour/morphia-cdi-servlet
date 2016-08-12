package com.wpic.boilerplate.servlet;

import com.wpic.boilerplate.provider.SampleProvider;
import com.wpic.boilerplate.service.SampleService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 */
@WebServlet(name="ImageServlet", urlPatterns={"/*"})
public class SampleServlet extends HttpServlet {

    @Inject
    private SampleService imageService;

    @Inject
    private SampleProvider sampleProvider;

    @Override
    protected void doGet(
            final HttpServletRequest req,
            final HttpServletResponse resp) throws ServletException, IOException
    {
        resp.getWriter().write("My name is " + this.sampleProvider.sayMyName() + "!");
    }

}

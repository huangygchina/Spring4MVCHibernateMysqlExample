/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-10 03:40:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>  \r\n");
      out.write("    <title>AngularJS $http 实例</title>  \r\n");
      out.write("    <style>\r\n");
      out.write("      .username.ng-valid {\r\n");
      out.write("          background-color: lightgreen;\r\n");
      out.write("      }\r\n");
      out.write("      .username.ng-dirty.ng-invalid-required {\r\n");
      out.write("          background-color: red;\r\n");
      out.write("      }\r\n");
      out.write("      .username.ng-dirty.ng-invalid-minlength {\r\n");
      out.write("          background-color: yellow;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .email.ng-valid {\r\n");
      out.write("          background-color: lightgreen;\r\n");
      out.write("      }\r\n");
      out.write("      .email.ng-dirty.ng-invalid-required {\r\n");
      out.write("          background-color: red;\r\n");
      out.write("      }\r\n");
      out.write("      .email.ng-dirty.ng-invalid-email {\r\n");
      out.write("          background-color: yellow;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("     <link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"></link>\r\n");
      out.write("     \r\n");
      out.write("  </head>\r\n");
      out.write("  <body ng-app=\"myApp\" class=\"ng-cloak\">\r\n");
      out.write("      <div class=\"generic-container\" ng-controller=\"UserController as ctrl\">\r\n");
      out.write("          <div class=\"panel panel-default\">\r\n");
      out.write("              <div class=\"panel-heading\"><span class=\"lead\">User Registration Form </span></div>\r\n");
      out.write("              <div class=\"formcontainer\">\r\n");
      out.write("                  <form ng-submit=\"ctrl.submit()\" name=\"myForm\" class=\"form-horizontal\">\r\n");
      out.write("                      <input type=\"hidden\" ng-model=\"ctrl.user.id\" />\r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                          <div class=\"form-group col-md-12\">\r\n");
      out.write("                              <label class=\"col-md-2 control-lable\" for=\"file\">Name</label>\r\n");
      out.write("                              <div class=\"col-md-7\">\r\n");
      out.write("                                  <input type=\"text\" ng-model=\"ctrl.user.username\" name=\"uname\" class=\"username form-control input-sm\" placeholder=\"Enter your name\" required ng-minlength=\"3\"/>\r\n");
      out.write("                                  <div class=\"has-error\" ng-show=\"myForm.$dirty\">\r\n");
      out.write("                                      <span ng-show=\"myForm.uname.$error.required\">This is a required field</span>\r\n");
      out.write("                                      <span ng-show=\"myForm.uname.$error.minlength\">Minimum length required is 3</span>\r\n");
      out.write("                                      <span ng-show=\"myForm.uname.$invalid\">This field is invalid </span>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                        \r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                          <div class=\"form-group col-md-12\">\r\n");
      out.write("                              <label class=\"col-md-2 control-lable\" for=\"file\">Address</label>\r\n");
      out.write("                              <div class=\"col-md-7\">\r\n");
      out.write("                                  <input type=\"text\" ng-model=\"ctrl.user.address\" class=\"form-control input-sm\" placeholder=\"Enter your Address. [This field is validation free]\"/>\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("\r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                          <div class=\"form-group col-md-12\">\r\n");
      out.write("                              <label class=\"col-md-2 control-lable\" for=\"file\">Email</label>\r\n");
      out.write("                              <div class=\"col-md-7\">\r\n");
      out.write("                                  <input type=\"email\" ng-model=\"ctrl.user.email\" name=\"email\" class=\"email form-control input-sm\" placeholder=\"Enter your Email\" required/>\r\n");
      out.write("                                  <div class=\"has-error\" ng-show=\"myForm.$dirty\">\r\n");
      out.write("                                      <span ng-show=\"myForm.email.$error.required\">This is a required field</span>\r\n");
      out.write("                                      <span ng-show=\"myForm.email.$invalid\">This field is invalid </span>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("\r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                          <div class=\"form-actions floatRight\">\r\n");
      out.write("                              <input type=\"submit\"  value=\"{{!ctrl.user.id ? 'Add' : 'Update'}}\" class=\"btn btn-primary btn-sm\" ng-disabled=\"myForm.$invalid\">\r\n");
      out.write("                              <button type=\"button\" ng-click=\"ctrl.reset()\" class=\"btn btn-warning btn-sm\" ng-disabled=\"myForm.$pristine\">Reset Form</button>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </form>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"panel panel-default\">\r\n");
      out.write("                <!-- Default panel contents -->\r\n");
      out.write("              <div class=\"panel-heading\"><span class=\"lead\">List of Users </span></div>\r\n");
      out.write("              <div class=\"tablecontainer\">\r\n");
      out.write("                  <table class=\"table table-hover\">\r\n");
      out.write("                      <thead>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                              <th>ID.</th>\r\n");
      out.write("                              <th>Name</th>\r\n");
      out.write("                              <th>Address</th>\r\n");
      out.write("                              <th>Email</th>\r\n");
      out.write("                              <th width=\"20%\"></th>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                      </thead>\r\n");
      out.write("                      <tbody>\r\n");
      out.write("                          <tr ng-repeat=\"u in ctrl.users\">\r\n");
      out.write("                              <td><span ng-bind=\"u.id\"></span></td>\r\n");
      out.write("                              <td><span ng-bind=\"u.username\"></span></td>\r\n");
      out.write("                              <td><span ng-bind=\"u.address\"></span></td>\r\n");
      out.write("                              <td><span ng-bind=\"u.email\"></span></td>\r\n");
      out.write("                              <td>\r\n");
      out.write("                              <button type=\"button\" ng-click=\"ctrl.edit(u.id)\" class=\"btn btn-success custom-width\">Edit</button>  <button type=\"button\" ng-click=\"ctrl.remove(u.id)\" class=\"btn btn-danger custom-width\">Remove</button>\r\n");
      out.write("                              </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                      </tbody>\r\n");
      out.write("                  </table>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <script src=\"http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js\"></script>\r\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js\"></script>\r\n");
      out.write("      <script src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("      <script src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("      <script src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/UserManagement.jsp(29,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/static/css/app.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/UserManagement.jsp(117,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/static/js/app.js");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/UserManagement.jsp(118,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/static/js/service/user_service.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/views/UserManagement.jsp(119,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/static/js/controller/user_controller.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }
}
package clojure;

import clojure.lang.*;

public final class template_do_template_fn__7074 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.template", "apply-template");
 }
 Object argv3;
 Object expr4;
 public template_do_template_fn__7074(final Object argv3, final Object expr4) {
  super();
  this.argv3 = argv3;
  this.expr4 = expr4;
 }
 public java.lang.Object invoke(java.lang.Object a1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.argv3, this.expr4, a1);
 }
}

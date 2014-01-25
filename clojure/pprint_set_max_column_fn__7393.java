package clojure;

import clojure.lang.*;

public final class pprint_set_max_column_fn__7393 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "set-field");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "max");
 }
 Object this1;
 Object new_max2;
 public pprint_set_max_column_fn__7393(final Object this1, final Object new_max2) {
  super();
  this.this1 = this1;
  this.new_max2 = new_max2;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(this.this1, const__1, this.new_max2);
 }
}

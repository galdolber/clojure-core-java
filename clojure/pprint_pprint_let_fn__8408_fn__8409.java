package clojure;

import clojure.lang.*;

public final class pprint_pprint_let_fn__8408_fn__8409 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-format");
 }
 Object cf__8217__auto__5;
 public pprint_pprint_let_fn__8408_fn__8409(final Object cf__8217__auto__5) {
  super();
  this.cf__8217__auto__5 = cf__8217__auto__5;
 }
 public java.lang.Object doInvoke(java.lang.Object args__8218__auto__1) {
  {
   Object navigator__8219__auto__2 = ((IFn)const__0).invoke(args__8218__auto__1);
   return ((IFn)const__1).invoke(this.cf__8217__auto__5, navigator__8219__auto__2);
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}

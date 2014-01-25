package clojure;

import clojure.lang.*;

public final class pprint_get_section_fn__7502 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "nl-t?");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "ancestor?");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block");
 }
 Object lb3;
 public pprint_get_section_fn__7502(final Object lb3) {
  super();
  this.lb3 = lb3;
 }
 public java.lang.Object invoke(java.lang.Object p1__7501_SHARP_1) {
  Object __r4916 = null;
  {
   Object and__3966__auto__2 = ((IFn)const__1.getRawRoot()).invoke(p1__7501_SHARP_1);
   Object __r4917;
   Object __r4918 = and__3966__auto__2;
   if (__r4918 != null && !(__r4918 == Boolean.FALSE)) {
    __r4917 = ((IFn)const__2.getRawRoot()).invoke(RT.get(p1__7501_SHARP_1, Keyword.intern(null, "logical-block")), this.lb3);
   } else {
    __r4917 = and__3966__auto__2;
   }
   __r4916 = __r4917;
  }
  return ((IFn)const__0.getRawRoot()).invoke(__r4916);
 }
}

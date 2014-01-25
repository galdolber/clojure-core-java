package clojure;

import clojure.lang.*;

public final class test_inc_report_counter_fn__7091 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "commute");
  const__1 = (clojure.lang.Var)RT.var("clojure.test", "*report-counters*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__4 = (java.lang.Object)0L;
 }
 Object name1;
 public test_inc_report_counter_fn__7091(final Object name1) {
  super();
  this.name1 = name1;
 }
 public java.lang.Object invoke() {
  Object __r4663 = null;
  {
   Object or__3968__auto__1 = ((IFn)const__1.get()).invoke(this.name1);
   Object __r4664;
   Object __r4665 = or__3968__auto__1;
   if (__r4665 != null && !(__r4665 == Boolean.FALSE)) {
    __r4664 = or__3968__auto__1;
   } else {
    __r4664 = const__4;
   }
   __r4663 = __r4664;
  }
  return ((IFn)const__0.getRawRoot()).invoke(const__1.get(), const__2.getRawRoot(), this.name1, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)__r4663))));
 }
}

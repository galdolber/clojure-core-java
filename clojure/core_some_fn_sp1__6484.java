package clojure;

import clojure.lang.*;

public final class core_some_fn_sp1__6484 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "some");
 }
 Object p1;
 public core_some_fn_sp1__6484(final Object p1) {
  super();
  this.p1 = p1;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  {
   Object or__3968__auto__5 = ((IFn)this).invoke(x1, y2, z3);
   Object __r4244 = or__3968__auto__5;
   if (__r4244 != null && !(__r4244 == Boolean.FALSE)) {
    return or__3968__auto__5;
   } else {
    return ((IFn)const__0.getRawRoot()).invoke(this.p1, args4);
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  {
   Object or__3968__auto__4 = ((IFn)this.p1).invoke(x1);
   Object __r4246 = or__3968__auto__4;
   if (__r4246 != null && !(__r4246 == Boolean.FALSE)) {
    return or__3968__auto__4;
   } else {
    {
     Object or__3968__auto__5 = ((IFn)this.p1).invoke(y2);
     Object __r4248 = or__3968__auto__5;
     if (__r4248 != null && !(__r4248 == Boolean.FALSE)) {
      return or__3968__auto__5;
     } else {
      return ((IFn)this.p1).invoke(z3);
     }
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  {
   Object or__3968__auto__3 = ((IFn)this.p1).invoke(x1);
   Object __r4250 = or__3968__auto__3;
   if (__r4250 != null && !(__r4250 == Boolean.FALSE)) {
    return or__3968__auto__3;
   } else {
    return ((IFn)this.p1).invoke(y2);
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)this.p1).invoke(x1);
 }
 public java.lang.Object invoke() {
  return null;
 }
 public int getRequiredArity() {
  return 3;
 }
}

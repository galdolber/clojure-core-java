package clojure;

import clojure.lang.*;

public final class core_every_pred_ep1__6420 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "every?");
 }
 Object p1;
 public core_every_pred_ep1__6420(final Object p1) {
  super();
  this.p1 = p1;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  Object __r4138 = null;
  {
   Object and__3966__auto__5 = ((IFn)this).invoke(x1, y2, z3);
   Object __r4139;
   Object __r4140 = and__3966__auto__5;
   if (__r4140 != null && !(__r4140 == Boolean.FALSE)) {
    __r4139 = ((IFn)const__1.getRawRoot()).invoke(this.p1, args4);
   } else {
    __r4139 = and__3966__auto__5;
   }
   __r4138 = __r4139;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4138)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  Object __r4141 = null;
  {
   Object and__3966__auto__4 = ((IFn)this.p1).invoke(x1);
   Object __r4142;
   Object __r4143 = and__3966__auto__4;
   if (__r4143 != null && !(__r4143 == Boolean.FALSE)) {
    Object __r4144 = null;
    {
     Object and__3966__auto__5 = ((IFn)this.p1).invoke(y2);
     Object __r4145;
     Object __r4146 = and__3966__auto__5;
     if (__r4146 != null && !(__r4146 == Boolean.FALSE)) {
      __r4145 = ((IFn)this.p1).invoke(z3);
     } else {
      __r4145 = and__3966__auto__5;
     }
     __r4144 = __r4145;
    }
    __r4142 = __r4144;
   } else {
    __r4142 = and__3966__auto__4;
   }
   __r4141 = __r4142;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4141)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  Object __r4147 = null;
  {
   Object and__3966__auto__3 = ((IFn)this.p1).invoke(x1);
   Object __r4148;
   Object __r4149 = and__3966__auto__3;
   if (__r4149 != null && !(__r4149 == Boolean.FALSE)) {
    __r4148 = ((IFn)this.p1).invoke(y2);
   } else {
    __r4148 = and__3966__auto__3;
   }
   __r4147 = __r4148;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4147)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return (clojure.lang.RT.booleanCast(((java.lang.Object)((IFn)this.p1).invoke(x1))) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke() {
  return Boolean.TRUE;
 }
 public int getRequiredArity() {
  return 3;
 }
}

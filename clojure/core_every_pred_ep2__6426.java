package clojure;

import clojure.lang.*;

public final class core_every_pred_ep2__6426 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "every?");
 }
 Object p11;
 Object p22;
 public core_every_pred_ep2__6426(final Object p11, final Object p22) {
  super();
  this.p11 = p11;
  this.p22 = p22;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  Object __r4152 = null;
  {
   Object and__3966__auto__5 = ((IFn)this).invoke(x1, y2, z3);
   Object __r4153;
   Object __r4154 = and__3966__auto__5;
   if (__r4154 != null && !(__r4154 == Boolean.FALSE)) {
    __r4153 = ((IFn)const__1.getRawRoot()).invoke(new clojure.core_every_pred_ep2__6426_fn__6427(this.p11, this.p22), args4);
   } else {
    __r4153 = and__3966__auto__5;
   }
   __r4152 = __r4153;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4152)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  Object __r4155 = null;
  {
   Object and__3966__auto__4 = ((IFn)this.p11).invoke(x1);
   Object __r4156;
   Object __r4157 = and__3966__auto__4;
   if (__r4157 != null && !(__r4157 == Boolean.FALSE)) {
    Object __r4158 = null;
    {
     Object and__3966__auto__5 = ((IFn)this.p11).invoke(y2);
     Object __r4159;
     Object __r4160 = and__3966__auto__5;
     if (__r4160 != null && !(__r4160 == Boolean.FALSE)) {
      Object __r4161 = null;
      {
       Object and__3966__auto__6 = ((IFn)this.p11).invoke(z3);
       Object __r4162;
       Object __r4163 = and__3966__auto__6;
       if (__r4163 != null && !(__r4163 == Boolean.FALSE)) {
        Object __r4164 = null;
        {
         Object and__3966__auto__7 = ((IFn)this.p22).invoke(x1);
         Object __r4165;
         Object __r4166 = and__3966__auto__7;
         if (__r4166 != null && !(__r4166 == Boolean.FALSE)) {
          Object __r4167 = null;
          {
           Object and__3966__auto__8 = ((IFn)this.p22).invoke(y2);
           Object __r4168;
           Object __r4169 = and__3966__auto__8;
           if (__r4169 != null && !(__r4169 == Boolean.FALSE)) {
            __r4168 = ((IFn)this.p22).invoke(z3);
           } else {
            __r4168 = and__3966__auto__8;
           }
           __r4167 = __r4168;
          }
          __r4165 = __r4167;
         } else {
          __r4165 = and__3966__auto__7;
         }
         __r4164 = __r4165;
        }
        __r4162 = __r4164;
       } else {
        __r4162 = and__3966__auto__6;
       }
       __r4161 = __r4162;
      }
      __r4159 = __r4161;
     } else {
      __r4159 = and__3966__auto__5;
     }
     __r4158 = __r4159;
    }
    __r4156 = __r4158;
   } else {
    __r4156 = and__3966__auto__4;
   }
   __r4155 = __r4156;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4155)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  Object __r4170 = null;
  {
   Object and__3966__auto__3 = ((IFn)this.p11).invoke(x1);
   Object __r4171;
   Object __r4172 = and__3966__auto__3;
   if (__r4172 != null && !(__r4172 == Boolean.FALSE)) {
    Object __r4173 = null;
    {
     Object and__3966__auto__4 = ((IFn)this.p11).invoke(y2);
     Object __r4174;
     Object __r4175 = and__3966__auto__4;
     if (__r4175 != null && !(__r4175 == Boolean.FALSE)) {
      Object __r4176 = null;
      {
       Object and__3966__auto__5 = ((IFn)this.p22).invoke(x1);
       Object __r4177;
       Object __r4178 = and__3966__auto__5;
       if (__r4178 != null && !(__r4178 == Boolean.FALSE)) {
        __r4177 = ((IFn)this.p22).invoke(y2);
       } else {
        __r4177 = and__3966__auto__5;
       }
       __r4176 = __r4177;
      }
      __r4174 = __r4176;
     } else {
      __r4174 = and__3966__auto__4;
     }
     __r4173 = __r4174;
    }
    __r4171 = __r4173;
   } else {
    __r4171 = and__3966__auto__3;
   }
   __r4170 = __r4171;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4170)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r4179 = null;
  {
   Object and__3966__auto__2 = ((IFn)this.p11).invoke(x1);
   Object __r4180;
   Object __r4181 = and__3966__auto__2;
   if (__r4181 != null && !(__r4181 == Boolean.FALSE)) {
    __r4180 = ((IFn)this.p22).invoke(x1);
   } else {
    __r4180 = and__3966__auto__2;
   }
   __r4179 = __r4180;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r4179)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke() {
  return Boolean.TRUE;
 }
 public int getRequiredArity() {
  return 3;
 }
}

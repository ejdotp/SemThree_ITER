----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01/06/2024 01:18:23 PM
-- Design Name: 
-- Module Name: Lab8A - Dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;
-- E. Jagadeeswar Patro - 2241016309;
entity Lab8A is
    Port ( A : in STD_LOGIC;
           B : in STD_LOGIC;
           C : in STD_LOGIC;
           D : in STD_LOGIC;
           F : out STD_LOGIC);
end Lab8A;

architecture Dataflow of Lab8A is

begin
F <=((NOT C) AND (NOT D)) OR ((NOT A) AND (NOT B)) OR ((NOT A) AND (NOT C)) OR (( NOT B) AND (NOT C)) OR ((NOT B) AND (NOT D)) OR ((NOT A) AND (NOT D));

end Dataflow;
